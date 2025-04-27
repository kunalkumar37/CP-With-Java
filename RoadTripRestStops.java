import java.util.*;

public class RoadTripRestStops {
    
    public static int minMovesToReachAllAmenities(int[] input1, int[] input2, int[] input3) {
        int n = input1[0]; // Number of rest stops
        int d = input1[1]; // Maximum allowed distance
        int r = input1[2]; // Required amenities
        
        int[] mileMarkers = input2; // Mile markers of each rest stop
        int[] amenities = input3;   // Amenities available at each rest stop
        
        // Create a graph that represents possible moves between rest stops
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            for (int j = i + 1; j < n; j++) {
                if (mileMarkers[j] - mileMarkers[i] <= d) {
                    graph[i].add(j);
                } else {
                    break; // Since mile markers are sorted, we can break early
                }
            }
        }
        
        // Use BFS to find the shortest path while tracking utilized amenities
        Queue<int[]> queue = new LinkedList<>();
        // Each state is [current stop, utilized amenities, moves]
        queue.offer(new int[]{0, amenities[0], 0});
        
        // Use a visited set to avoid revisiting the same state
        Set<String> visited = new HashSet<>();
        visited.add(0 + "," + amenities[0]);
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int stop = current[0];
            int utilizedAmenities = current[1];
            int moves = current[2];
            
            // Check if we've reached the last rest stop with all required amenities
            if (stop == n - 1 && (utilizedAmenities & r) == r) {
                return moves;
            }
            
            // Try all possible next stops
            for (int nextStop : graph[stop]) {
                int newAmenities = utilizedAmenities | amenities[nextStop];
                String newState = nextStop + "," + newAmenities;
                
                if (!visited.contains(newState)) {
                    visited.add(newState);
                    queue.offer(new int[]{nextStop, newAmenities, moves + 1});
                }
            }
        }
        
        return -1; // No valid path exists
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] input1 = {5, 10, 7};
        int[] input2 = {0, 5, 10, 15, 20};
        int[] input3 = {1, 2, 4, 0, 0};
        
        int result = minMovesToReachAllAmenities(input1, input2, input3);
        System.out.println("Minimum moves required: " + result); // Expected: 3
    }
}