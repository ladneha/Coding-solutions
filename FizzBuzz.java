/*Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
*/
class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        
        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0){
                StringBuilder sb = new StringBuilder();
                if(i%3==0){
                    sb.append("Fizz");
                }
                if(i%5==0){
                    sb.append("Buzz");
                }
                list.add(sb.toString());
            }else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}