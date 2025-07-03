package Question4;

public sealed interface Shipment permits ExpressShipment,OvernightShipment,StandardShipment{
    String getTrackingDetails();
}
