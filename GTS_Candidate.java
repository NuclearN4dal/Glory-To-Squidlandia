public class GTS_Candidate
{
    private String intent;
    private String coo;
    private String seal;
    private String name;
  
    public GTS_Candidate(String intent, String coo, String seal, String name)
    {
       setIntent(intent);
       setCoo(coo);
       setSeal(seal);
       setName(name);
    }

    public void setIntent(String intent)
    {
        this.intent = intent;
    }

    public void setCoo(String coo)
    {
        this.coo = coo;
    }
    
    public void setSeal(String seal){
        this.seal = seal;
    }
    
    public void setName(String name)
    {
      this.name = name;
    }
  
    public String getIntent() 
    {
        return intent;
    }

     public String getCoo() 
    {
        return coo;
    }
     
     public String getSeal()
     {
       return seal;
     }
     public String getName()
     {
       return name;
     }
     
    public String toString() 
    {

      StringBuffer strBuf = new StringBuffer("_________________________________________________________________________________\n");
      strBuf.append("|  VISAS:\n");
      
      strBuf.append("|  NAME: "+name+"\n" ); 
      strBuf.append("|  COO: "+coo+"\n" ); 
      strBuf.append("|  SEAL: "+seal+"\n" ); 
      strBuf.append("|  INTENT: "+intent+"\n");
      strBuf.append( "_________________________________________________________________________________") ;
      strBuf.append( "\n") ;    
      
      return strBuf.toString() ;
    }
    
}