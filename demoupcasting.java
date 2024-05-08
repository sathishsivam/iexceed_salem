class phone
{
    public void calling()
    {
        System.out.println("Calling phone");
    }
}

class sony extends phone
{
//    @Override
//    public void calling()
//    {
//     System.out.println("calling sony phone");
//    } 
   public void otherfacility()
   {
    System.out.println("GPS enabled");
   }
}


class demoupcasting
 {
    
    public static void main(String ad[])
    {
        sony sobj=new sony();
         phone  pobj =(phone)sobj;
         pobj.calling();
         pobj.otherfacility();
       
    }
}
