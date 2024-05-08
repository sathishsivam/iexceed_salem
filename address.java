 class address {
    int pin,plot;
    String city,st_name;
    address(int plot,String st_name,String city,int pin)
    {
        this.plot=plot;
        this.st_name=st_name;
        this.city=city;
        this.pin=pin;
    }
    public void displayaddress()
    {
        System.out.println("Plot name="+plot);
        System.out.println("Street Name="+st_name);
        System.out.println("City="+city);
        System.out.println("Pincode="+pin);
    }
}
