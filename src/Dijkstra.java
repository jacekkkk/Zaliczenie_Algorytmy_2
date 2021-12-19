public class Dijkstra {
    public void main (int[,] graph, int src)
    {
        int[] dist = new int [V];

        bool[] sptSet = new bool[V];

        for (int i = 0; i < V; i++)
        {
            dist[i] = int.MaxValue;
            sptSet[i] = false;


            dist[src] = 0;

            for (int v = 0; v < V; v++)
            {
                if (sptSet[v])
            }
        }
    }

}
