import java.util.*;

public class ParkingLot {
    int largeSpotSize;
    int compactSpotSize;
    int bikeSpotSize;

    List<ParkingSpot> largeParkingSpotList;
    List<ParkingSpot> compactParkingSpotList;
    List<ParkingSpot> bikeParkingSpotList;

    public ParkingLot(int largeSpotSize, int compactSpotSize, int bikeSpotSize) {
        this.largeSpotSize = largeSpotSize;
        this.compactSpotSize = compactSpotSize;
        this.bikeSpotSize = bikeSpotSize;

        largeParkingSpotList = new ArrayList<>();
        compactParkingSpotList = new ArrayList<>();
        bikeParkingSpotList = new ArrayList<>();
    }

    public void parkTheVehicle(Vehicle vehicle) {
        System.out.println("We are parking the vehicle " + vehicle.getVehicleType());
        if (VehicleType.TRUCK.equals(vehicle.getVehicleType())) {
            if (largeSpotSize > 0) {
                parkLargeVehicle(vehicle);
                System.out.println("Vehicle "+ vehicle.getVehicleType()+" parked successfully");
            } else {
                System.out.println("Large Spots are full");
            }
        } else if (VehicleType.CAR.equals(vehicle.getVehicleType())) {
            if (compactSpotSize > 0) {
                parkCompactVehicle(vehicle);
                System.out.println("Vehicle "+ vehicle.getVehicleType()+" parked successfully");
            } else {
                System.out.println("Compact Spots are full");
            }
        } else if (VehicleType.BIKE.equals(vehicle.getVehicleType())) {
            if (bikeSpotSize > 0) {
                parkBikeVehicle(vehicle);
                System.out.println("Vehicle "+ vehicle.getVehicleType()+" parked successfully");
            } else {
                System.out.println("Bike Spots are full");
            }
        } else {
            System.out.println("Given vehicle parking is not available");
        }
       
    }

    public void parkLargeVehicle(Vehicle vehicle) {
        ParkingSpot largeParkingSpot = new ParkingSpot(ParkingSpotType.LARGE);
        largeParkingSpot.setisfree(false);
        largeParkingSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeParkingSpot);

        largeParkingSpotList.add(largeParkingSpot);
        largeSpotSize--;
    }

    public void parkCompactVehicle(Vehicle vehicle) {
        ParkingSpot compactParkingSpot = new ParkingSpot(ParkingSpotType.COMPACT);
        compactParkingSpot.setisfree(false);
        compactParkingSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactParkingSpot);

        compactParkingSpotList.add(compactParkingSpot);
        compactSpotSize--;

    }

    public void parkBikeVehicle(Vehicle vehicle) {
        ParkingSpot bikeParkingSpot = new ParkingSpot(ParkingSpotType.BIKE);
        bikeParkingSpot.setisfree(false);
        bikeParkingSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeParkingSpot);

        bikeParkingSpotList.add(bikeParkingSpot);
        bikeSpotSize--;
    }

    public void unparkTheVehicle(Vehicle vehicle){
        System.out.println("We are unparking the vehicle" + vehicle.getVehicleType());

        ParkingSpot parkingSpot=vehicle.getParkingSpot();
        parkingSpot.setisfree(true);

        if(VehicleType.BIKE.equals(vehicle.getVehicleType())){
            bikeSpotSize++;
        }else if(VehicleType.CAR.equals(vehicle.getVehicleType())){
            compactSpotSize++;
        }else{
            largeSpotSize++;
        }

        System.out.println("Vehicle " +vehicle.getVehicleType()+" unparked successfully");
    }
}
