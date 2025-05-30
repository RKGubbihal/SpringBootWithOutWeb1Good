package test2.SpringBootWithOutWeb1;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller
{
    @GetMapping("/hello")
    public String getData()
    {
        return "<h1> /hello: 'getData' Method: 'SpringBootWithOutWeb1Good/Issue Fixed Now': IntelliJ IDE: Issue Fixed Now.....";
    }

    @GetMapping("/gethello")
    public String getHello()
    {
        System.out.println("Displaying SpringBootWithOutWeb1Good/Issue Fixed Now  Message from the 'GetMapping' Method ");
        return "<h1> /gethello: 'getHello' Method: 'SpringBootWithOutWeb1Good/Issue Fixed Now': IntelliJ IDE: Issue Fixed Now..... </h1>";
    }

    @PostMapping("/posthello")
    public String postHello()
    {
        System.out.println("Posting 'SpringBootWithOutWeb1Good/Issue Fixed Now' Spring Boot_IntelliJ IDE: Issue Fixed Now Application..... from the 'PostMapping' Method ");
        return "<h1> /posthello: 'postHello' 'SpringBootWithOutWeb1Good/Issue Fixed Now': IntelliJ IDE: Issue Fixed Now.....</h1>";
    }

    @PutMapping("/puthello")
    public String putHello()
    {
        System.out.println("Putting SpringBootWithOutWeb1Good/Issue Fixed Now  Message from the 'PutMapping' Method ");
        return "<h1> /puthello: 'putHello' 'SpringBootWithOutWeb1Good/Issue Fixed Now': IntelliJ IDE: Issue Fixed Now.....</h1>";
    }

    @DeleteMapping("/deletehello")
    public String deleteHello()
    {
        System.out.println("Deleting 'SpringBootWithOutWeb1Good/Issue Fixed Now' Spring Boot_IntelliJ IDE: Issue Fixed Now Application..... from the 'DeleteMapping' Method ");
        return "<h1> /deletehello: 'deleteHello' Method:'SpringBootWithOutWeb1Good/Issue Fixed Now': IntelliJ IDE: Issue Fixed Now.....</h1>";
    }

}
