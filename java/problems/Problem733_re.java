package problems;

public class Problem733_re {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        // 시작 색깔
        if (startColor == color) {
            return image;
        }
        // 시작색깔이랑 바꾸려는 색상이랑 같으면 바꿀 필요없음

        dfs(image, sr, sc, startColor, color);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int startColor, int color) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) {
            return;
        }
        // 범위 설정

        if (image[row][col] != startColor) {
            return;
        }
        // 현재색이랑 시작색이랑 다르면 바꿀 필요 없다.

        image[row][col] = color;
        // 수정
        dfs(image, row - 1, col, startColor, color);
        // 위
        dfs(image, row + 1, col, startColor, color);
        // 아래
        dfs(image, row, col - 1, startColor, color);
        // 왼쪽
        dfs(image, row, col + 1, startColor, color);
        // 오른쪽
    }
}
