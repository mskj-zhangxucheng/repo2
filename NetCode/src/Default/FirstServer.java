package Default;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��Ϥ����
 * ����������
 * 1��ָ���˿� ʹ��ServerSocket����������
 * 2������ʽ�ȴ����� accept
 * 3������: �������������
 * 4���ͷ���Դ 
 *
 */
public class FirstServer {

	public static void main(String[] args) throws Exception {
		System.out.println("-------Server---------");
		
		// 1��ָ���˿� ʹ��ServerSocket����������
		ServerSocket server=new ServerSocket(8888);
		
		// 2������ʽ�ȴ����� accept
		Socket client=server.accept();
		System.out.println("һ���ͻ��˽���������");
		
		// 3������: �������������
		DataInputStream dis=new DataInputStream(client.getInputStream());
		System.out.println(dis.readUTF());
		
		// 4���ͷ���Դ 
		dis.close();
		client.close();
	}

}