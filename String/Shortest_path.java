package String;

public class Shortest_path {
    public static double getpath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N')
                y++;
            else if (dir == 'S')
                y--;
            else if (dir == 'E')
                x++;
            else if (dir == 'W')
                x--;
        }

        // Calculate shortest path distance
        double distance = Math.sqrt(x * x + y * y);
        return distance;
    }

    public static void main(String[] args) {
        String arr = "WNEENESENNN";
        System.out.println("The Distance is: " + getpath(arr));
    }
}
