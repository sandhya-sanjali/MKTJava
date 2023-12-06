package TypeCasting;
class Googleauth
{
	void login()
	{
		System.out.println("Login by Username");
	}
	void sms()
	{
		System.out.println("Login by SMS");
	}
}
class Facebookauth extends Googleauth
{
	void email()
	{
		System.out.println("Login by Email");
	}
	void call()
	{
		System.out.println("Login by Call");
	}
}
class Instagramauth extends Facebookauth
{
	void sms1()
	{
		System.out.println("Login");
	}
	void call1()
	{
		System.out.println("Call");
	}
}
public class Upcasting5 extends Instagramauth
{
	void email1()
	{
		System.out.println("Email");
	}
	void login1()
	{
		System.out.println("Login");
	}

	public static void main(String[] args) 
	{
		Facebookauth i1=new Instagramauth();//upcasting
		i1.call();
		i1.email();
		i1.login();
		i1.sms();
		
		Instagramauth i2=new Upcasting5();//upcasting for downcasting
		i2.sms1();
		i2.call1();
		
		Upcasting5 u1=(Upcasting5)i2;//downcasting
		u1.email();
		u1.login1();
		
	}

}
