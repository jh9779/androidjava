package network;

import java.net.InetAddress;

// domain name: www.naver.com ---DNS(Domain,범위 Name System)서버--→ ip주소

public class DomainToIp {

	public static void main(String[] args) throws Exception {
		String domain = "www.naver.com";
		InetAddress ip = InetAddress.getByName(domain);
		System.out.println("ip주소: " + ip.getHostAddress());
	}

}
