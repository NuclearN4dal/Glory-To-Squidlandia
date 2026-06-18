public class GTS_Player_Stat
{
    private String name;
    private int creditScore;
    private int money;
  
    public GTS_Player_Stat(int creditScore, int money, String name)
    {
       setCreditScore(creditScore);
       setMoney(money);
       setName(name);
    }

    public void setCreditScore(int creditScore)
    {
        this.creditScore = creditScore;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }
    
    public void setName(String name)
    {
      this.name = name;
    }
  
    public int getCreditScore() 
    {
        return creditScore;
    }

     public int getMoney() 
    {
        return money;
    }
     
     public String getName()
     {
       return name;
     }
     
    public String toString() 
    {

      StringBuffer strBuf = new StringBuffer("______________________________\n");
      strBuf.append("|  Agent Dossier:\n");
      strBuf.append("|  Name: "+name+"\n" ); 
      strBuf.append("|  Cash: "+money+"\n" ); 
      strBuf.append("|  Credit: "+creditScore+"\n" ); 
      strBuf.append( "______________________________") ;
      strBuf.append( "\n") ;    
      
      return strBuf.toString() ;
    }
    
}