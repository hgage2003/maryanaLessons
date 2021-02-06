package twotter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DownloadManager
{
    private URL url;
    private int maxThreads = 1;
    private long timeout = 0;
    
    private HashMap<String, DownloadJob> jobs = new HashMap<>();
    
    public DownloadManager configure(int maxThreads, long timeout)
    {
	this.maxThreads = maxThreads;
	this.timeout = timeout;
	return this;
    }
    
    public DownloadManager specifyDownloadLocation(URL url)
    {
	this.url = url;
	return this;
    }
    
    public String startDownload()
    {
	DownloadJob job = new DownloadJob(url);
	job.setData(downloadFromURL(url));
	jobs.put(job.getJobId(), job);
	
	job.start();
	return job.getJobId();
    }
    
    private byte[] downloadFromURL(URL url)
    {
	byte[] res = ("url is: " + url.toString()).getBytes();
	
	return res;
    }
    
    void stopDownLoad(String jobId)
    {
	jobs.get(jobId);
    }
    
    public static void main(String[] args) throws MalformedURLException
    {
	DownloadManager manager = new DownloadManager();
	String id = manager.configure(4, 4000)
		.specifyDownloadLocation(new URL("http://google.com"))
		.startDownload();
	
	System.out.println(id);
    }
    
}
