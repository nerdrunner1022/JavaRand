class User{
  int numTries = 0;
  private int usrNum ;

  public User(){
    
  }

  public User(int a){
    usrNum = a;
  }

  void incrementTries(){
    numTries++;
  }

  int getNumTries(){
    return numTries;
  }

  public int getUsrNum(){
    return usrNum;
  }

  public void setUsrNum(int a){
    usrNum = a;
  }
}
