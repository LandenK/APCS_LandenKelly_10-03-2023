
public class PictureExercise
{
    public static void main(String[] args)
    {    	
        // If you want to not have to pick the image each time, fill in the correct address in the next line and delete the "//" 
        // Picture clouds = new Picture("C:\\Pictures\\...");
        Picture myPicture = new Picture();
        myPicture.pick();
        
        // Use Picture methods to draw your picture object HERE
        
        // Draws the picture
        myPicture.draw();
        
        // Gets the height
        int height = myPicture.getHeight();
        int width = myPicture.getWidth();
        
        // Use Picture methods & print\println to print out the height and width of your picture HERE
        
        // Prints the height
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        
    }
}

// int name = function -> print the function using the name
