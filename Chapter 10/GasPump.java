//Name: Jack Ambery (worked with Matt Lorenzo)
//Assignment: Gas Pump Question Ch. 10 FR Test
//Date: 2 March 2020

public class GasPump {
   
   //-----Fields-----
   
   private static double totalSales;
   private double gasPricePerGallon;
   
   //-----Constructors-----
   
   public GasPump(double gasPricePerGallon) {
      this.gasPricePerGallon = gasPricePerGallon;
   }
   
   //-----Methods-----
   
   public double getTotalSales() {
      return totalSales;
   }
   
   private double getCost(double gallons) {
      return gallons * gasPricePerGallon;
   }
   
   private double pump(double gallons) {
      this.addGas(gallons); //not sure
      totalSales += getCost(gallons);
      return getCost(gallons);
   }
   
   public double fill(Car car) {
      double tankSpace = car.getTankCapacity() - car.getGasAmt();
      totalSales += getCost(tankSpace);
      pump(tankSpace);
      return getCost(tankSpace);
   }  
   
   public double fill(Car car, double dollarLimit) {
      double tankSpace = car.getTankCapacity() - car.getGasAmt();
      double maxPossGals = dollarLimit / gasPricePerGallon;
      totalSales += getCost(tankSpace - (tankSpace - maxPossGals));
      pump(tankSpace - (tankSpace - maxPossGals));
      return getCost(tankSpace - (tankSpace - maxPossGals));
   }
   
}