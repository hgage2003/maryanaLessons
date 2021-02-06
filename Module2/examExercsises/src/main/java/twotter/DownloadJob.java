package twotter;

import java.net.URL;
import java.util.UUID;

public class DownloadJob extends Thread
{
    private String jobId;
    private URL url;
    private byte[] data;

    public byte[] getData()
    {
        return data;
    }

    public void setData(byte[] data)
    {
        this.data = data;
    }

    public DownloadJob(URL url)
    {
	this.url = url;
	this.jobId = UUID.randomUUID().toString();
    }
    
    @Override
    public void run()
    {
	System.out.println("Job " + jobId + " started for url=" + url);
    }

    public String getJobId()
    {
        return jobId;
    }
}
