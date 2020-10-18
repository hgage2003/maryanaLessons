package exSheet8;

import java.io.IOException;
import java.net.URL;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Exercise4 
{
	
	public static final String site = "<body id=\"www-wikipedia-org\">"
			+ "<div class=\"central-textlogo\">"
			+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb" + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\"" + "</div>"
			+ "</body>";

	public static void main(String[] args) throws IOException
	{	
		// здесь будет индекс начала нужной строки
		int marker = site.indexOf("img src");
		
		// ищем первые двойные скобки после img src
		marker = site.indexOf('"', marker);
		
		// пропускаем кавычки
		marker++;
		
		int endMarker = site.indexOf('"', marker);
		
		String downloadUrl = site.substring(marker, endMarker);
		
		URL url = new URL(downloadUrl);
		BufferedImage image = ImageIO.read(url); ImageIO.write(image, "png", new File("bild.png"));
	}

}
