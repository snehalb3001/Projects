public class ParkingSpot {
    private ParkingSpotType parkingSpotType;
    private boolean isfree;
    private Vehicle vehicle;

    public ParkingSpot(ParkingSpotType parkingSpotType){
        this.parkingSpotType=parkingSpotType;
    }


    public ParkingSpotType getParkingSpotType(){
        return parkingSpotType;
    }

    public void setParkingSpot(ParkingSpotType parkingSpotType){
        this.parkingSpotType=parkingSpotType;
    }

    public boolean getisfree(){
        return this.isfree;
    }

    public void setisfree(boolean isfree){
        this.isfree=isfree;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

}
