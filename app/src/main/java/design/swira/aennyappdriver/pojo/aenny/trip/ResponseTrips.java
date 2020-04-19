package design.swira.aennyappdriver.pojo.aenny.trip;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ResponseTrips{

	@SerializedName("Driver_Trips_Accept_Status")
	private List<Object> driverTripsAcceptStatus;

	@SerializedName("Trip_Normal_Distance")
	private double tripNormalDistance;

	@SerializedName("Trip_Cost")
	private double tripCost;

	@SerializedName("IsAdditionalFees")
	private boolean isAdditionalFees;

	@SerializedName("Driver")
	private Object driver;

	@SerializedName("Trip_Destination_Latt")
	private double tripDestinationLatt;

	@SerializedName("Trips_Rates")
	private List<Object> tripsRates;

	@SerializedName("Trip_Destination")
	private String tripDestination;

	@SerializedName("Trip_Destination_Long")
	private double tripDestinationLong;

	@SerializedName("Payment_Type")
	private int paymentType;

	@SerializedName("Total_Waiting_Minutes")
	private double totalWaitingMinutes;

	@SerializedName("Trip_Time")
	private String tripTime;

	@SerializedName("Trip_Pickup_Long")
	private double tripPickupLong;

	@SerializedName("Trip_Schedule_Time")
	private Object tripScheduleTime;

	@SerializedName("Trip_Chat")
	private List<Object> tripChat;

	@SerializedName("Vehicle")
	private Object vehicle;

	@SerializedName("Driver_Id")
	private int driverId;

	@SerializedName("Trip_Destination_Time")
	private Object tripDestinationTime;

	@SerializedName("Trips_Status")
	private Object tripsStatus;

	@SerializedName("Complaints")
	private List<Object> complaints;

	@SerializedName("Client")
	private Object client;

	@SerializedName("Trips_Types")
	private Object tripsTypes;

	@SerializedName("Trip_Notes")
	private Object tripNotes;

	@SerializedName("Goverments_Ratio")
	private Object govermentsRatio;

	@SerializedName("Trip_Type_Id")
	private Object tripTypeId;

	@SerializedName("Healthy_Number")
	private int healthyNumber;

	@SerializedName("Payment_Types")
	private Object paymentTypes;

	@SerializedName("Trip_Pickup")
	private String tripPickup;

	@SerializedName("Trip_Key")
	private String tripKey;

	@SerializedName("Trip_Date")
	private String tripDate;

	@SerializedName("Trips_Navigations")
	private List<Object> tripsNavigations;

	@SerializedName("Vehicle_Id")
	private int vehicleId;

	@SerializedName("Trip_Schedule_Date")
	private Object tripScheduleDate;

	@SerializedName("Emergencys")
	private List<Object> emergencys;

	@SerializedName("Trip_Pickup_Latt")
	private double tripPickupLatt;

	@SerializedName("Goverment")
	private Object goverment;

	@SerializedName("Trip_Distance")
	private double tripDistance;

	@SerializedName("Visa_Number")
	private Object visaNumber;

	@SerializedName("UnEmployeedDriverRatio")
	private Object unEmployeedDriverRatio;

	@SerializedName("Trip_Rash_Distance")
	private double tripRashDistance;

	@SerializedName("Trip_Id")
	private int tripId;

	@SerializedName("Trip_Status")
	private int tripStatus;

	@SerializedName("Client_Id")
	private int clientId;

	@SerializedName("Client_Report")
	private List<Object> clientReport;

	@SerializedName("Handicapped_Number")
	private int handicappedNumber;

	@SerializedName("Goverments_Id")
	private Object govermentsId;

	@SerializedName("Trip_Destination_Date")
	private Object tripDestinationDate;

	public void setDriverTripsAcceptStatus(List<Object> driverTripsAcceptStatus){
		this.driverTripsAcceptStatus = driverTripsAcceptStatus;
	}

	public List<Object> getDriverTripsAcceptStatus(){
		return driverTripsAcceptStatus;
	}

	public void setTripNormalDistance(double tripNormalDistance){
		this.tripNormalDistance = tripNormalDistance;
	}

	public double getTripNormalDistance(){
		return tripNormalDistance;
	}

	public void setTripCost(double tripCost){
		this.tripCost = tripCost;
	}

	public double getTripCost(){
		return tripCost;
	}

	public void setIsAdditionalFees(boolean isAdditionalFees){
		this.isAdditionalFees = isAdditionalFees;
	}

	public boolean isIsAdditionalFees(){
		return isAdditionalFees;
	}

	public void setDriver(Object driver){
		this.driver = driver;
	}

	public Object getDriver(){
		return driver;
	}

	public void setTripDestinationLatt(double tripDestinationLatt){
		this.tripDestinationLatt = tripDestinationLatt;
	}

	public double getTripDestinationLatt(){
		return tripDestinationLatt;
	}

	public void setTripsRates(List<Object> tripsRates){
		this.tripsRates = tripsRates;
	}

	public List<Object> getTripsRates(){
		return tripsRates;
	}

	public void setTripDestination(String tripDestination){
		this.tripDestination = tripDestination;
	}

	public String getTripDestination(){
		return tripDestination;
	}

	public void setTripDestinationLong(double tripDestinationLong){
		this.tripDestinationLong = tripDestinationLong;
	}

	public double getTripDestinationLong(){
		return tripDestinationLong;
	}

	public void setPaymentType(int paymentType){
		this.paymentType = paymentType;
	}

	public int getPaymentType(){
		return paymentType;
	}

	public void setTotalWaitingMinutes(double totalWaitingMinutes){
		this.totalWaitingMinutes = totalWaitingMinutes;
	}

	public double getTotalWaitingMinutes(){
		return totalWaitingMinutes;
	}

	public void setTripTime(String tripTime){
		this.tripTime = tripTime;
	}

	public String getTripTime(){
		return tripTime;
	}

	public void setTripPickupLong(double tripPickupLong){
		this.tripPickupLong = tripPickupLong;
	}

	public double getTripPickupLong(){
		return tripPickupLong;
	}

	public void setTripScheduleTime(Object tripScheduleTime){
		this.tripScheduleTime = tripScheduleTime;
	}

	public Object getTripScheduleTime(){
		return tripScheduleTime;
	}

	public void setTripChat(List<Object> tripChat){
		this.tripChat = tripChat;
	}

	public List<Object> getTripChat(){
		return tripChat;
	}

	public void setVehicle(Object vehicle){
		this.vehicle = vehicle;
	}

	public Object getVehicle(){
		return vehicle;
	}

	public void setDriverId(int driverId){
		this.driverId = driverId;
	}

	public int getDriverId(){
		return driverId;
	}

	public void setTripDestinationTime(Object tripDestinationTime){
		this.tripDestinationTime = tripDestinationTime;
	}

	public Object getTripDestinationTime(){
		return tripDestinationTime;
	}

	public void setTripsStatus(Object tripsStatus){
		this.tripsStatus = tripsStatus;
	}

	public Object getTripsStatus(){
		return tripsStatus;
	}

	public void setComplaints(List<Object> complaints){
		this.complaints = complaints;
	}

	public List<Object> getComplaints(){
		return complaints;
	}

	public void setClient(Object client){
		this.client = client;
	}

	public Object getClient(){
		return client;
	}

	public void setTripsTypes(Object tripsTypes){
		this.tripsTypes = tripsTypes;
	}

	public Object getTripsTypes(){
		return tripsTypes;
	}

	public void setTripNotes(Object tripNotes){
		this.tripNotes = tripNotes;
	}

	public Object getTripNotes(){
		return tripNotes;
	}

	public void setGovermentsRatio(Object govermentsRatio){
		this.govermentsRatio = govermentsRatio;
	}

	public Object getGovermentsRatio(){
		return govermentsRatio;
	}

	public void setTripTypeId(Object tripTypeId){
		this.tripTypeId = tripTypeId;
	}

	public Object getTripTypeId(){
		return tripTypeId;
	}

	public void setHealthyNumber(int healthyNumber){
		this.healthyNumber = healthyNumber;
	}

	public int getHealthyNumber(){
		return healthyNumber;
	}

	public void setPaymentTypes(Object paymentTypes){
		this.paymentTypes = paymentTypes;
	}

	public Object getPaymentTypes(){
		return paymentTypes;
	}

	public void setTripPickup(String tripPickup){
		this.tripPickup = tripPickup;
	}

	public String getTripPickup(){
		return tripPickup;
	}

	public void setTripKey(String tripKey){
		this.tripKey = tripKey;
	}

	public String getTripKey(){
		return tripKey;
	}

	public void setTripDate(String tripDate){
		this.tripDate = tripDate;
	}

	public String getTripDate(){
		return tripDate;
	}

	public void setTripsNavigations(List<Object> tripsNavigations){
		this.tripsNavigations = tripsNavigations;
	}

	public List<Object> getTripsNavigations(){
		return tripsNavigations;
	}

	public void setVehicleId(int vehicleId){
		this.vehicleId = vehicleId;
	}

	public int getVehicleId(){
		return vehicleId;
	}

	public void setTripScheduleDate(Object tripScheduleDate){
		this.tripScheduleDate = tripScheduleDate;
	}

	public Object getTripScheduleDate(){
		return tripScheduleDate;
	}

	public void setEmergencys(List<Object> emergencys){
		this.emergencys = emergencys;
	}

	public List<Object> getEmergencys(){
		return emergencys;
	}

	public void setTripPickupLatt(double tripPickupLatt){
		this.tripPickupLatt = tripPickupLatt;
	}

	public double getTripPickupLatt(){
		return tripPickupLatt;
	}

	public void setGoverment(Object goverment){
		this.goverment = goverment;
	}

	public Object getGoverment(){
		return goverment;
	}

	public void setTripDistance(double tripDistance){
		this.tripDistance = tripDistance;
	}

	public double getTripDistance(){
		return tripDistance;
	}

	public void setVisaNumber(Object visaNumber){
		this.visaNumber = visaNumber;
	}

	public Object getVisaNumber(){
		return visaNumber;
	}

	public void setUnEmployeedDriverRatio(Object unEmployeedDriverRatio){
		this.unEmployeedDriverRatio = unEmployeedDriverRatio;
	}

	public Object getUnEmployeedDriverRatio(){
		return unEmployeedDriverRatio;
	}

	public void setTripRashDistance(double tripRashDistance){
		this.tripRashDistance = tripRashDistance;
	}

	public double getTripRashDistance(){
		return tripRashDistance;
	}

	public void setTripId(int tripId){
		this.tripId = tripId;
	}

	public int getTripId(){
		return tripId;
	}

	public void setTripStatus(int tripStatus){
		this.tripStatus = tripStatus;
	}

	public int getTripStatus(){
		return tripStatus;
	}

	public void setClientId(int clientId){
		this.clientId = clientId;
	}

	public int getClientId(){
		return clientId;
	}

	public void setClientReport(List<Object> clientReport){
		this.clientReport = clientReport;
	}

	public List<Object> getClientReport(){
		return clientReport;
	}

	public void setHandicappedNumber(int handicappedNumber){
		this.handicappedNumber = handicappedNumber;
	}

	public int getHandicappedNumber(){
		return handicappedNumber;
	}

	public void setGovermentsId(Object govermentsId){
		this.govermentsId = govermentsId;
	}

	public Object getGovermentsId(){
		return govermentsId;
	}

	public void setTripDestinationDate(Object tripDestinationDate){
		this.tripDestinationDate = tripDestinationDate;
	}

	public Object getTripDestinationDate(){
		return tripDestinationDate;
	}

	@Override
 	public String toString(){
		return 
			"ResponseTrips{" + 
			"driver_Trips_Accept_Status = '" + driverTripsAcceptStatus + '\'' + 
			",trip_Normal_Distance = '" + tripNormalDistance + '\'' + 
			",trip_Cost = '" + tripCost + '\'' + 
			",isAdditionalFees = '" + isAdditionalFees + '\'' + 
			",driver = '" + driver + '\'' + 
			",trip_Destination_Latt = '" + tripDestinationLatt + '\'' + 
			",trips_Rates = '" + tripsRates + '\'' + 
			",trip_Destination = '" + tripDestination + '\'' + 
			",trip_Destination_Long = '" + tripDestinationLong + '\'' + 
			",payment_Type = '" + paymentType + '\'' + 
			",total_Waiting_Minutes = '" + totalWaitingMinutes + '\'' + 
			",trip_Time = '" + tripTime + '\'' + 
			",trip_Pickup_Long = '" + tripPickupLong + '\'' + 
			",trip_Schedule_Time = '" + tripScheduleTime + '\'' + 
			",trip_Chat = '" + tripChat + '\'' + 
			",vehicle = '" + vehicle + '\'' + 
			",driver_Id = '" + driverId + '\'' + 
			",trip_Destination_Time = '" + tripDestinationTime + '\'' + 
			",trips_Status = '" + tripsStatus + '\'' + 
			",complaints = '" + complaints + '\'' + 
			",client = '" + client + '\'' + 
			",trips_Types = '" + tripsTypes + '\'' + 
			",trip_Notes = '" + tripNotes + '\'' + 
			",goverments_Ratio = '" + govermentsRatio + '\'' + 
			",trip_Type_Id = '" + tripTypeId + '\'' + 
			",healthy_Number = '" + healthyNumber + '\'' + 
			",payment_Types = '" + paymentTypes + '\'' + 
			",trip_Pickup = '" + tripPickup + '\'' + 
			",trip_Key = '" + tripKey + '\'' + 
			",trip_Date = '" + tripDate + '\'' + 
			",trips_Navigations = '" + tripsNavigations + '\'' + 
			",vehicle_Id = '" + vehicleId + '\'' + 
			",trip_Schedule_Date = '" + tripScheduleDate + '\'' + 
			",emergencys = '" + emergencys + '\'' + 
			",trip_Pickup_Latt = '" + tripPickupLatt + '\'' + 
			",goverment = '" + goverment + '\'' + 
			",trip_Distance = '" + tripDistance + '\'' + 
			",visa_Number = '" + visaNumber + '\'' + 
			",unEmployeedDriverRatio = '" + unEmployeedDriverRatio + '\'' + 
			",trip_Rash_Distance = '" + tripRashDistance + '\'' + 
			",trip_Id = '" + tripId + '\'' + 
			",trip_Status = '" + tripStatus + '\'' + 
			",client_Id = '" + clientId + '\'' + 
			",client_Report = '" + clientReport + '\'' + 
			",handicapped_Number = '" + handicappedNumber + '\'' + 
			",goverments_Id = '" + govermentsId + '\'' + 
			",trip_Destination_Date = '" + tripDestinationDate + '\'' + 
			"}";
		}

	public ResponseTrips(double tripCost, double tripDestinationLatt, String tripDestination, double tripDestinationLong,  String tripTime, double tripPickupLong,    int tripTypeId, int healthyNumber, String tripPickup,  String tripDate,   double tripPickupLatt, double tripDistance, String visaNumber, int tripStatus, int clientId, int handicappedNumber,int tripId) {
		this.tripCost = tripCost;
		this.tripDestinationLatt = tripDestinationLatt;
		this.tripDestination = tripDestination;
		this.tripDestinationLong = tripDestinationLong;
		//this.paymentType = paymentType;
		this.tripTime = tripTime;
		this.tripPickupLong = tripPickupLong;
		//this.tripScheduleTime = tripScheduleTime;
		//this.driverId = driverId;
		//this.tripDestinationTime = tripDestinationTime;
		//this.tripNotes = tripNotes;
		this.tripTypeId = tripTypeId;
		this.healthyNumber = healthyNumber;
		this.tripPickup = tripPickup;
		//this.tripKey = tripKey;
		this.tripDate = tripDate;
		//this.vehicleId = vehicleId;
		//this.tripScheduleDate = tripScheduleDate;
		this.tripPickupLatt = tripPickupLatt;
		this.tripDistance = tripDistance;
		this.visaNumber = visaNumber;
		this.tripStatus = tripStatus;
		this.clientId = clientId;
		this.handicappedNumber = handicappedNumber;
		//this.govermentsId = govermentsId;
		//this.tripDestinationDate = tripDestinationDate;
		this.tripId=tripId;
	}
}