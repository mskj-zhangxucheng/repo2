package Default;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Spider {

	public static void main(String[] args) {
		//basicSpider();
		Spider("http://baidu.com");
	}
	static void Spider(String src) {
		URL url=null;
		InputStream is=null;
		BufferedReader br=null;
		StringBuilder sb=new StringBuilder();
		String temp="";
		try {
			url=new URL(src);
			is=url.openStream();
			br=new BufferedReader(new InputStreamReader(is,"utf-8"));
			while((temp=br.readLine())!=null) {
				System.out.println(temp);
				sb.append(temp);
			}
			System.out.println(sb);
		} catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		
	}
	static void basicSpider() {
        URL url = null;
        InputStream is = null;
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String temp = "";
        try {
            url = new URL("http://www.baidu.com");
            is = url.openStream();
            br = new BufferedReader(new InputStreamReader(is,"utf-8"));
            /* 
             * 这样就可以将网络内容下载到本地机器。
             * 然后进行数据分析，建立索引。这也是搜索引擎的第一步。
             */
            while ((temp = br.readLine()) != null) {
            	System.out.println(temp);
                System.out.println();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
