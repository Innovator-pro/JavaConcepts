class UserDefinedException {

  public static void main(String args[]){
  
    try{
      throws new UserDefinedException("User defined exception is thrown");
    }
    catch(UserDefinedException ude){
      System.out.println("User Defined Exception caught");
     }
  }
}

class UserDefinedException extends Exception{
        
        UserDefinedException(String msg){
            super(msg);
          }
     }
          
          

    
