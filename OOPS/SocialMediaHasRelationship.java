import java.util.*;
class Profile
{
	private String profilePhoto;
	private String bio;
	private String nickName;

	Profile(String profilePhoto,String bio)
	{
		this(profilePhoto,bio,"");
	}

	Profile(String profilePhoto,String bio,String nickName)
	{
		this.profilePhoto = profilePhoto;
		this.bio = bio;
		this.nickName = nickName;
	}

	public void getProfileInfo()
	{
		System.out.println("\n profile Info ");
		System.out.println("profilePhoto : "+ profilePhoto);
		System.out.println("bio : " + bio);
		System.out.println("nickName : " + nickName);
	}
}
class Comment
{
	private String comment;
	private User user;

	Comment(String comment,User user)
	{
		this.comment = comment;
		this.user = user;

	}

	public void getCommentInfo()
	{
		System.out.println(user.getUserName()+":" + comment);
	}
}
class Post
{
	private String media;
	private String type;
	private String location;
	private String caption;

	ArrayList<Comment> commentList = new ArrayList<Comment>();

	Post(String media,String type)
	{
		this(media,type,"Not avail");

	}
	Post(String media,String type,String location){
		this(media,type,location,"Not avail");
	}
	Post(String media,String type,String location,String caption)
	{
		this.media = media;
		this.type = type;
		this.location = location;
		this.caption = caption;

	}

	public  void getPostInfo(){
		System.out.println("\n Post info ");
		System.out.println("media  : " + media);
		System.out.println("Type : "+type);
		System.out.println("Location : " + location );
		System.out.println("Caption : " + caption);

		if(commentList.size() == 0)
		{
			System.out.println("\n No comments \n");
			return;
		}

		for(Comment comment : commentList)
		{
			comment.getCommentInfo();
		}
		System.out.println("--------------POST END ------------------");
	}
	public void addComment(Comment newComment)
	{
		commentList.add(newComment);
	}
}
class User
{
	private String name;
	private long contact;
	private String email;
	private Profile profile; // composition
	private  ArrayList<Post> postList = new ArrayList<Post>();//aggregation

	User(String name,long contact,String email,Profile profile)
	{
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.profile = profile;
	}

	public void getUserInfo(){
		System.out.println("\n User Info ");
		System.out.println("User name " + name);
		System.out.println("Contact "+contact);
		System.out.println("Email : " + email);

	}
	public Profile getProfile()
	{
		return profile;
	}

	public void addPost(Post newPost)
	{
		postList.add(newPost);
	}

	public ArrayList<Post> getPostList()
	{
		return postList;
	
	}

	public String getUserName()
	{
		return name;
	}
}
class Group{
	private String name;
	private ArrayList<User> userList = new ArrayList<User>();
	int indx = 0;
	Group(String name,User user)
	{
		this.name = name;
		this.userList.add(user);
	}

	public void getGroupInfo()
	{
		System.out.println("Name : " + name);
		System.out.println("Username : " + userList.get(indx++).getUserName());
	}
}
class SocialMedia
{
	private String name;
	private ArrayList<User> userList = new ArrayList<User>(); // agrregation
	private ArrayList<Group> groupList = new ArrayList<Group>(); //composition

	SocialMedia(String name)
	{
		this.name = name;
	}

	public void launchApplication()
	{
		System.out.println("WELCOME " + this.name);

	}
	public void addUser(User newUser)
	{
		userList.add(newUser);
	}

	public ArrayList<User> getUserList()
	{
		return userList;
	}

	public void addGroup(ArrayList<User> userList,String groupName)
	{
		for(User user : userList)
		{
			groupList.add(new Group(groupName,user));

		}
	}

	public ArrayList<Group> getGroupList()
	{
		return groupList;
	}

}
class SocialMediaHasRelationship
{
	public static void main(String[] args) {

		SocialMedia app = new SocialMedia("InstaGram");
		app.launchApplication();

		Profile profile1 = new Profile("suresh.jpg","Self lover","Mein hun suresh");
		User user1 = new User("Ramesh kumar",975364578l,"suresh@gmail.com",profile1);
		app.addUser(user1);

		Profile profile2 = new Profile("ramesh.jpg","java developer","Maa ka ladla");
		User user2 = new User("Suresh kumar",9075364578l,"ramesh@gmail.com",profile2);
		app.addUser(user2);
		Profile profile3 = new Profile("sakshi.jpg","Living in my world","attitude queen");
		User user3 = new User("sakshi kumari",90753645l,"ramesh@gmail.com",profile3);
		app.addUser(user3);

		ArrayList<User> userList = app.getUserList();
		System.out.println("**********USER LIST ***********");
		for(User element : userList)
		{
			element.getUserInfo();
			element.getProfile().getProfileInfo();
			System.out.println("------------------------------------------------------");

		}

		System.out.println("\n ************USer Post ***********************");

		Post post1 = new Post("abc.mp4","reel","somwhere On earth","No caption Needed");
		Post post2 = new Post("rameshlonaavaala.jpg","Post","Hill station","In the Arms of Nature");

			user1.addPost(post1);
			user1.addPost(post2);

		Post  post3 = new Post("sakshi.jpg","Post","Out of range","Paari Hun mein");
			user3.addPost(post3);


			ArrayList<User> userList1 = app.getUserList();
			for (User user : userList1 ) {
				user.getUserInfo();
				user.getProfile().getProfileInfo();
				ArrayList<Post> posts = user.getPostList();

				for (Post post : posts ) {

					post.getPostInfo();
				}
				System.out.println("-----------------------Next User Profile----------------------------");

			}

			System.out.println("-----------------After Adding Comment -----------------------");

			ArrayList<Post> postListSakshi = user3.getPostList();
			Post sakshiPost1 = postListSakshi.get(0);
			sakshiPost1.addComment(new Comment("Nice Pic",user1));
			sakshiPost1.addComment(new Comment("Chand Dharti peeee",user2));
			sakshiPost1.addComment(new Comment("@ramesh : thank you dada",user3));
			sakshiPost1.addComment(new Comment("heeee heeee",user2));

			sakshiPost1.getPostInfo();

			ArrayList<User> groupList = new ArrayList<User>();
			groupList.add(user1);
			groupList.add(user2);
			groupList.add(user3);
			app.addGroup(groupList,"Three Idiots");

			System.out.println("\n ---------------- GROUP LIST ---------------------------");
			ArrayList<Group> groupList1 = app.getGroupList();
			for ( Group group : groupList1 ) {
				group.getGroupInfo();
				
			}



			

		
	}
	
}