

public class Ride {
	//attributes:
	public double APPEAL;    //the appeal of this ride.
	public int RIDELENGTH;   //the number of minutes a ride takes
	public int RIDERS;       //the number of riders per minute

	//data:
	public int[] waittime;  //wait time at each minute in the day.

	//runtime:
	public int status=0;         //amount of time remaining in load interval
	public Queue<Customer> line; //customers waiting to ride
	public Queue<Customer> ride; //customers riding the ride
	public Park p;

	public String toString() {
		return String.format("R:%.3f:%d:%d", APPEAL,RIDELENGTH,RIDERS);
	}

	public Ride(Park p) {
		line = new Queue<Customer>(p.maxtime);
		ride = new Queue<Customer>(p.maxtime);
		//set size of queue:

		waittime = new int[p.maxtime];
		this.p = p;
	}

	public void init() {
		for (int i = 0; i < RIDERS*RIDELENGTH; i++) {
			ride.put(null);
		}
	}
	
	public void tick() {
		//move the riders through:
		for (int i = 0; i < RIDERS; i++) {  
		    if(ride.size()>0){
		    Customer r =  ride.get();
		    r.status[time] = RiderStatus.FREE; 
		    }
			//.status[p.time] = RiderStatus.FREE; //free a rider
			if(line.size()>0) ride.put(line.get());  //move from line to ride.
			else ride.put(null); //send an empty customer if necessary
		}
		
		//everybody on ride is riding:
		for (int i = 0; i < ride.size(); i++) {
			if(ride.peek(i)!=null) ride.peek(i).status[p.time] = RiderStatus.RIDING;
		}

		//everybody on the line is waiting:
		for (int i = 0; i < line.size(); i++) {
			line.peek(i).status[p.time] = RiderStatus.WAITING;
		}

		//save the wait time:
		waittime[p.time] = RIDELENGTH*(line.size()/(RIDERS));
	}
}
