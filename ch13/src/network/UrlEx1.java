package network;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlEx1 {
	public static void main(String[] args) {
		// URL (Uniform Resource Location )
		// http://www.naver.com
		
		// URL : URL에 대한 정보를 제공하는 클래스
		// http://www.code.com:80/sample/hello.html?refere=code#index1
		// 프로토콜 : http(HyperText Transfer Protocol)
		// 호스트명 : www.code.com
		// 포트번호 : 80 (80번은 대부분 생략)
		// 경로명 : /sample/
		// 파일명 : 접근하려는 자원의 이름 -> hello.html
		// 쿼리 : URL에서 ? 이후의 부분 -> refere=code
		// 참조 : URL에서 # 이후의 부분 -> index1
		
		try {
			URL url = new URL("http://www.code.com:80/sample/hello.html?refere=code#index1");
			// 호스트명과 포트를 문자열로 반환
			System.out.println("url.getAuthority() : " + url.getAuthority());
			// 기본 포트 반환
			System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
			System.out.println("url.getPort() : " + url.getPort());
			// 파일명을 반환
			System.out.println("url.getFile() : " + url.getFile());
			// 호스트명 반환
			System.out.println("url.getHost() : " + url.getHost());
			// 경로명 반환
			System.out.println("url.getPath() : " + url.getPath());
			// 프로토콜 반환
			System.out.println("url.getProtocol() : " + url.getProtocol());
			// 참조 반환
			System.out.println("url.getRef() : " + url.getRef());
			// URL을 문자열로 반환
			System.out.println("url.toExternalForm() : " + url.toExternalForm());
			// URL을 URI로 변환하여 반환 
			// URI(Uniform Resource Identifier) : URL보다 조금 더 큰 개념
			System.out.println("url.toURI() : " + url.toURI());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
