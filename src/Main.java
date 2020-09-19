import org.w3c.dom.ls.LSOutput;

public class Main {


    /*

    Create a class called User. It should contain the following fields

            firstName
            lastName
            userName
            password

    Add a constructor along with getters and setters for each field.
    Update the setter for the password so that it does the following:
    Password should only be set if the length is at least 10 characters.




    Bonus (10 points) - must be completed before 9/26 to receive credit

    Add another rule to the setPassword method so that the password must contain a special character.

    Hint:
    Look into unicode values. Or, if you're familiar with regex, you can use that as well.
    There are many ways to answer this question.
     */


    public static void main(String[] args) {


        User one = new User("Bruce", "James", "Bjames", "BJ3855");



        System.out.println(one.firstName);
        System.out.println(one.lastName);
        System.out.println(one.userName);
        System.out.println(one.password);


        one.setPassword("3344557788BJ");




        }

    }




