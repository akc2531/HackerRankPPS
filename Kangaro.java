/*https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true  */

 // Write your code here
public static String kangaroo(int x1, int v1, int x2, int v2) {
    if(v2>=v1&&x2>x1)
    return "NO";
    else
    {
        int jump=(x2-x1)/(v1-v2);
        if((x2-x1)%(v1-v2)==0&&jump>=0)
        return "YES";
        else
        return "NO";
        
    }
}
