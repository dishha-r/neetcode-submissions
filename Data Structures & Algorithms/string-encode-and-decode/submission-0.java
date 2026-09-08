class Solution { 
    public String encode(List<String> strs) { 
        StringBuilder sb = new StringBuilder(); // Fixed typo
        for(String s: strs){ 
            sb.append(s.length()).append('#').append(s); 
        } 
        return sb.toString(); 
    } 

    public List<String> decode(String str) { 
        List<String> result = new ArrayList<>(); 
        int i = 0; 
        
        while(i < str.length()){ 
            int j = i; // Declared 'j' as an int
            
            while(str.charAt(j) != '#'){ 
                j++; 
            } 
            
            // Moved this block INSIDE the while loop
            int length = Integer.parseInt(str.substring(i, j)); 
            String word = str.substring(j + 1, j + 1 + length); 
            result.add(word); 
            
            i = j + 1 + length; 
        } 
        return result; 
    } 
}
