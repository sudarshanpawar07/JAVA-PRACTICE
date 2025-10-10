class MicrosoftOffice
{
	private String firstName;
	private String lastName;
	private String userName;
	private  String password;
	private  String liscenceDate;
   private	String email;
   private String fileType;

   MicrosoftOffice(String firstName,String lastName,String
	userName,String password ,String liscenceDate,String email,
	String fileType)
   {
   	this.firstName=firstName;
   	this.lastName=lastName;
   	this.userName=userName;
   	this.password=password;
   	this.liscenceDate=liscenceDate;
   	this.email=email;
   	this.fileType=fileType;
   }
   public void getMicrosoftOfficsinfo()
   {
   	System.out.println("\n MicrosoftOffice info");
   	System.out.println("First Name  : "+firstName);
   	System.out.println("Last Name : "+lastName);
   	System.out.println("User Name : "+userName);
   	System.out.println("Passward : "+password);
   	System.out.println("LiseDate : "+liscenceDate);
   	System.out.println("Email : "+email);
   	System.out.println("File Type : "+fileType);
   }

}
class Word extends MicrosoftOffice
{
	private int pageCount;
    private  boolean spellCheckEnabled;
    private String documentFormat;
     private  int wordCount;
     private boolean trackChanges;

     Word(String firstName,String lastName,String
			userName,String password ,String liscenceDate,String email,String fileType
			,int pageCount,boolean spellCheckEnabled,String documentFormat ,int wordCount,boolean trackChanges)
     {
     	super(firstName,lastName,userName,password,liscenceDate,email,fileType);
     	this.pageCount=pageCount;
     	this.spellCheckEnabled=spellCheckEnabled;
     	this.documentFormat=documentFormat;
     	this.wordCount=wordCount;
     	this.trackChanges=trackChanges;
     }
     public void getWordInfo()
     {
     	System.out.println("\n Word info");
     	System.out.println("pageCount :"+pageCount);
     	System.out.println("spellCheckEnabled :"+spellCheckEnabled);
     	System.out.println("documentFormat : "+documentFormat);
     	System.out.println("wordCount : "+wordCount);
     	System.out.println("trackChanges : "+trackChanges);
     }
}

class PowerPoint extends MicrosoftOffice
{

    private int slideCount;
    private  boolean animationEnabled;
    private  String theme;
    private  int transitionSpeed;
    private boolean presenterView;

    PowerPoint(String firstName,String lastName,String
					userName,String password ,String liscenceDate,String email,String fileType
				,int slideCount,boolean animationEnabled,String theme ,int transitionSpeed,boolean presenterView)
    {
    	super(firstName,lastName,userName,password,liscenceDate,email,fileType);
    	this.slideCount=slideCount;
    	this.animationEnabled=animationEnabled;
    	this.theme=theme;
    	this.transitionSpeed=transitionSpeed;
    	this.presenterView=presenterView;
    }
    public void getPowerPoint()
    {
    	System.out.println("\n PowerPoint info");
    	System.out.println("slideCount :"+slideCount);
    	System.out.println("animationEnabled :"+animationEnabled);
    	System.out.println("theme :"+theme);
    	System.out.println("transitionSpeed :"+transitionSpeed);
    	System.out.println("presenterView :"+presenterView);
    }
}
class HierachicleMicrosoftProgram
{
	public static void main(String[] args) {
		

		Word word=new Word("sudarshan","pawar","sudarshanpawar","1234","18-jan-2022","sp@gmail.com","Office Suite",
							25,true,"DOCX",4300,true);



		PowerPoint pp=new PowerPoint("suresh","pawar","sureshpawar","12345","18-jan-2023","sureshpawar2gmail.com","Office Suite",
				25,true,"corpurate blue",2,true);

		word.getMicrosoftOfficsinfo();
		pp.getMicrosoftOfficsinfo();
		word.getWordInfo();
		pp.getPowerPoint();
		
	}
}