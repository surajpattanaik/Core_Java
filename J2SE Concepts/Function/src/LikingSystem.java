
public class LikingSystem {
public void likePhoto(int currentLikes,String Comment,boolean Like) {
	System.out.println("feedback: " + Comment);
	if(Like)
	{
		currentLikes += 1;
	}
	System.out.println("Number of Likes: " + currentLikes);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LikingSystem v = new LikingSystem();
v.likePhoto(3,"Impressive!",true);
	}

}
