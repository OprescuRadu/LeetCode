class Solution {
    public List<String> fizzBuzz(int n) {
        int j = 0;
        List<String> lista = new ArrayList<>(n);
        for(int i = 1; i <=n; i++){
            if( i % 15 == 0){
                lista.add("FizzBuzz");
            } else if(i % 3 == 0){
                lista.add("Fizz");
            } else if(i % 5 == 0){
                lista.add("Buzz");
            } else{
               lista.add(Integer.toString(i));                 
            }
        }
        return lista;
    }
}