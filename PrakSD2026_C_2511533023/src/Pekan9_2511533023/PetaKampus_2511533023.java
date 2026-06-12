package Pekan9_2511533023;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class PetaKampus_2511533023 extends JFrame {

   
	private static final long serialVersionUID = 1L;
	
    private final Map<String, List<String>> adjList_3023 = new HashMap<>();
    private final Map<String, Point> nodePositions_3023 = new HashMap<>();
    
    // Status Pencarian
    private List<String> path_3023 = new ArrayList<>();
    private Set<String> visitedNodes_3023 = new LinkedHashSet<>();
    private int exploredCount_3023 = 0;

    // Komponen GUI
    private JComboBox<String> cbStart_3023;
    private JComboBox<String> cbGoal_3023;
    private JPanel panelGraph_3023;
    private JLabel lblJalur_3023;
    private JLabel lblDikunjungi_3023;
    private JLabel lblJumlah_3023;

    public PetaKampus_2511533023() {
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS - NIM: 2511533023");
        setSize(850, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 1. Inisialisasi Data Peta
        initGraphData_3023();

        // 2. Membuat Panel Atas (Kontrol Input)
        JPanel panelTop_3023 = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
        panelTop_3023.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        panelTop_3023.add(new JLabel("Lokasi Awal :"));
        String[] lokasiArray_3023 = nodePositions_3023.keySet().toArray(new String[0]);
        Arrays.sort(lokasiArray_3023);
        cbStart_3023 = new JComboBox<>(lokasiArray_3023);
        panelTop_3023.add(cbStart_3023);

        panelTop_3023.add(new JLabel("Lokasi Tujuan :"));
        cbGoal_3023 = new JComboBox<>(lokasiArray_3023);
        panelTop_3023.add(cbGoal_3023);

        JButton btnBFS_3023 = new JButton("BFS");
        JButton btnDFS_3023 = new JButton("DFS");
        JButton btnReset_3023 = new JButton("RESET");

        // Pewarnaan tombol 
        btnBFS_3023.setBackground(new Color(144, 238, 144));
        btnDFS_3023.setBackground(new Color(255, 218, 121));
        btnReset_3023.setBackground(new Color(240, 128, 128));

        panelTop_3023.add(btnBFS_3023);
        panelTop_3023.add(btnDFS_3023);
        panelTop_3023.add(btnReset_3023);
        add(panelTop_3023, BorderLayout.NORTH);

        // 3. Membuat Panel Tengah (Visualisasi Graph)
        panelGraph_3023 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                displayGraph(g); 
            }
        };
        panelGraph_3023.setBackground(Color.WHITE);
        panelGraph_3023.setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH"));
        add(panelGraph_3023, BorderLayout.CENTER);

        // 4. Membuat Panel Bawah (Hasil Pencarian)
        JPanel panelBottom_3023 = new JPanel();
        panelBottom_3023.setLayout(new BoxLayout(panelBottom_3023, BoxLayout.Y_AXIS));
        panelBottom_3023.setBorder(BorderFactory.createTitledBorder("Hasil Pencarian"));
        panelBottom_3023.setPreferredSize(new Dimension(800, 130));

        lblJalur_3023 = new JLabel("Jalur : -");
        lblDikunjungi_3023 = new JLabel("Node Dikunjungi : -");
        lblJumlah_3023 = new JLabel("Jumlah Node Dieksplorasi : 0");

        // Mengatur margin tulisan hasil
        lblJalur_3023.setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));
        lblDikunjungi_3023.setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));
        lblJumlah_3023.setBorder(BorderFactory.createEmptyBorder(2, 10, 5, 10));

        panelBottom_3023.add(lblJalur_3023);
        panelBottom_3023.add(lblDikunjungi_3023);
        panelBottom_3023.add(lblJumlah_3023);
        add(panelBottom_3023, BorderLayout.SOUTH);

        // 5. Action Listeners Tombol
        btnBFS_3023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String start = (String) cbStart_3023.getSelectedItem();
                String goal = (String) cbGoal_3023.getSelectedItem();
                BFS(start, goal);
                displayPath();
            }
        });

        btnDFS_3023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String start = (String) cbStart_3023.getSelectedItem();
                String goal = (String) cbGoal_3023.getSelectedItem();
                DFS(start, goal);
                displayPath();
            }
        });

        btnReset_3023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGraph();
            }
        });
    }

    // Menginisialisasi data simpul dan koordinat visualnya
    private void initGraphData_3023() {
        
        nodePositions_3023.put("Gerbang", new Point(50, 250));
        nodePositions_3023.put("Pos Satpam", new Point(180, 250));
        nodePositions_3023.put("Rektorat", new Point(320, 150));
        nodePositions_3023.put("Masjid", new Point(320, 350));
        nodePositions_3023.put("Perpustakaan", new Point(480, 150));
        nodePositions_3023.put("Auditorium", new Point(480, 350));
        nodePositions_3023.put("Fak. Teknik", new Point(620, 100));
        nodePositions_3023.put("Fak. Ekonomi", new Point(620, 250));
        nodePositions_3023.put("Fak. Hukum", new Point(620, 400));
        nodePositions_3023.put("Kantin Pusat", new Point(750, 180));
        nodePositions_3023.put("Asrama", new Point(750, 320));

        // Inisialisasi Adjacency List kosong
        for (String node : nodePositions_3023.keySet()) {
            adjList_3023.put(node, new ArrayList<>());
        }

        // Menambahkan 16 Sisi (Edge) secara bolak-balik (Undirected Graph)
        addEdge_3023("Gerbang", "Pos Satpam");
        addEdge_3023("Pos Satpam", "Rektorat");
        addEdge_3023("Pos Satpam", "Masjid");
        addEdge_3023("Rektorat", "Perpustakaan");
        addEdge_3023("Rektorat", "Auditorium");
        addEdge_3023("Masjid", "Auditorium");
        addEdge_3023("Perpustakaan", "Fak. Teknik");
        addEdge_3023("Perpustakaan", "Fak. Ekonomi");
        addEdge_3023("Auditorium", "Fak. Ekonomi");
        addEdge_3023("Auditorium", "Fak. Hukum");
        addEdge_3023("Fak. Teknik", "Kantin Pusat");
        addEdge_3023("Fak. Ekonomi", "Kantin Pusat");
        addEdge_3023("Fak. Ekonomi", "Asrama");
        addEdge_3023("Fak. Hukum", "Asrama");
        addEdge_3023("Kantin Pusat", "Asrama");
        addEdge_3023("Gerbang", "Masjid"); 
    }

    private void addEdge_3023(String source, String dest) {
        adjList_3023.get(source).add(dest);
        adjList_3023.get(dest).add(source);
    }

   

    // 1. Method BFS()
    public void BFS(String start, String goal) {
        path_3023.clear();
        visitedNodes_3023.clear();
        exploredCount_3023 = 0;

        Queue<String> queue = new LinkedList<>();
        Map<String, String> parentMap = new HashMap<>();

        queue.add(start);
        visitedNodes_3023.add(start);

        boolean found = false;

        while (!queue.isEmpty()) {
            String current = queue.poll();
            exploredCount_3023++;

            if (current.equals(goal)) {
                found = true;
                break;
            }

            for (String neighbor : adjList_3023.get(current)) {
                if (!visitedNodes_3023.contains(neighbor)) {
                    visitedNodes_3023.add(neighbor);
                    parentMap.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        if (found) {
            String curr = goal;
            while (curr != null) {
                path_3023.add(0, curr);
                curr = parentMap.get(curr);
            }
        }
    }

    // 2. Method DFS()
    public void DFS(String start, String goal) {
        path_3023.clear();
        visitedNodes_3023.clear();
        exploredCount_3023 = 0;

        Stack<String> stack = new Stack<>();
        Map<String, String> parentMap = new HashMap<>();

        stack.push(start);

        boolean found = false;

        while (!stack.isEmpty()) {
            String current = stack.pop();

            if (!visitedNodes_3023.contains(current)) {
                visitedNodes_3023.add(current);
                exploredCount_3023++;

                if (current.equals(goal)) {
                    found = true;
                    break;
                }

                // Dibalik agar urutan eksplorasi alphabetis/teratur
                List<String> neighbors = adjList_3023.get(current);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    String neighbor = neighbors.get(i);
                    if (!visitedNodes_3023.contains(neighbor)) {
                        parentMap.put(neighbor, current);
                        stack.push(neighbor);
                    }
                }
            }
        }

        if (found) {
            String curr = goal;
            while (curr != null) {
                path_3023.add(0, curr);
                curr = parentMap.get(curr);
            }
        }
    }

    // 3. Method displayGraph()
    public void displayGraph(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gambar Garis Sisi (Edge) terlebih dahulu
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(2));
        Set<String> drawnEdges = new HashSet<>();

        for (String node : adjList_3023.keySet()) {
            Point p1 = nodePositions_3023.get(node);
            for (String neighbor : adjList_3023.get(node)) {
                String edgeKey = node.compareTo(neighbor) < 0 ? node + "-" + neighbor : neighbor + "-" + node;
                if (!drawnEdges.contains(edgeKey)) {
                    Point p2 = nodePositions_3023.get(neighbor);
                    
                    
                    if (path_3023.contains(node) && path_3023.contains(neighbor) &&
                        Math.abs(path_3023.indexOf(node) - path_3023.indexOf(neighbor)) == 1) {
                        g2.setColor(Color.RED);
                        g2.setStroke(new BasicStroke(4));
                        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                        g2.setColor(Color.GRAY);
                        g2.setStroke(new BasicStroke(2));
                    } else {
                        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                    drawnEdges.add(edgeKey);
                }
            }
        }

        // Gambar Bulatan Simpul (Vertex Node)
        int radius = 24;
        for (Map.Entry<String, Point> entry : nodePositions_3023.entrySet()) {
            String nodeName = entry.getKey();
            Point p = entry.getValue();

            // Logika Pewarnaan Node 
            if (path_3023.contains(nodeName)) {
                g2.setColor(new Color(255, 102, 102)); 
            } else if (visitedNodes_3023.contains(nodeName)) {
                g2.setColor(new Color(255, 255, 153)); 
            } else {
                g2.setColor(new Color(173, 216, 230)); 
            }

            g2.fillOval(p.x - radius, p.y - radius, radius * 2, radius * 2);
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(2));
            g2.drawOval(p.x - radius, p.y - radius, radius * 2, radius * 2);

            // Cetak Text Label Nama Node
            g2.setFont(new Font("Arial", Font.BOLD, 12));
            FontMetrics fm = g2.getFontMetrics();
            int textWidth = fm.stringWidth(nodeName);
            g2.drawString(nodeName, p.x - textWidth / 2, p.y + 5);
        }
    }

    // 4. Method displayPath()
    public void displayPath() {
        if (path_3023.isEmpty()) {
            lblJalur_3023.setText("Jalur : JALUR TIDAK DITEMUKAN!");
        } else {
            lblJalur_3023.setText("Jalur : " + String.join(" -> ", path_3023));
        }
        
        lblDikunjungi_3023.setText("Node Dikunjungi : " + visitedNodes_3023.toString());
        lblJumlah_3023.setText("Jumlah Node Dieksplorasi : " + exploredCount_3023);
        
        // Meminta panel menggambar ulang visual graph setelah data berubah
        panelGraph_3023.repaint();
    }

    // 5. Method resetGraph()
    public void resetGraph() {
        path_3023.clear();
        visitedNodes_3023.clear();
        exploredCount_3023 = 0;
        
        lblJalur_3023.setText("Jalur : -");
        lblDikunjungi_3023.setText("Node Dikunjungi : -");
        lblJumlah_3023.setText("Jumlah Node Dieksplorasi : 0");
        
        cbStart_3023.setSelectedIndex(0);
        cbGoal_3023.setSelectedIndex(0);
        
        panelGraph_3023.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaKampus_2511533023().setVisible(true);
        });
    }
}
