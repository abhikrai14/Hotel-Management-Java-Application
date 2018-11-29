



class Booking extends Person{
	
	private Time book_time;
	private Room book_room;
	public Booking next;
	public Booking(String n,String c, int h, int m, int rn, String rt){
		super(n,c);
		book_time=new Time(h,m);
		book_room = new Room(rn, rt);
	}

	
	public String readTime(){return book_time.toString();}
	
	public void resetFlight(int h,int m){
		book_time.reset(h,m);
	}
	
	public String getDetails(){
	return super.readPerson()+ " ,Booking Time : "+ book_time  +" ,Room : " + book_room +" \n";
	} 
	
	public void print(){
		System.out.print("["+super.readPerson()+ " ,Booking Time : "+ book_time  +" ,Room " + book_room + " ]->");
	}


	   
}