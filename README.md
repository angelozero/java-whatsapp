# Java Whatsapp

- A simple application to send messages to whatsapp using java + ultramsg

- [Documentation - Ultramsg](https://docs.ultramsg.com/)
- [How to Send a WhatsApp API with Java](https://blog.ultramsg.com/how-to-send-whatsapp-api-using-java/)

- Basicly what you have to do is:
    - Ultramsg account is required to run examples. [Log in](https://user.ultramsg.com/signin.php?url=Lw==) or [Create Account](https://user.ultramsg.com/signin.php?url=Lw==) if you dont have one.
    - Go to your instance or Create one if you haven't already.
    - Scan Qr and make sure that instance Auth Status : authenticated
    - Start sending Messages
    
```javascript
public static void main(String args[]) throws IOException {
  HttpResponse<String> response = Unirest.post("https://api.ultramsg.com/YOUR_INSTANCE_ID/messages/chat")
  .header("Content-Type", "application/x-www-form-urlencoded") 
			.field("token", "YOUR_TOKEN_ID")
			.field("to", "+5599999999999")
			.field("body", "Angelo Zero Message Test!!!")

  .asString();
     System.out.println("===================");
     System.out.println(response.body().string());
}
``` 
