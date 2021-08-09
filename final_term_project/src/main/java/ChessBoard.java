import java.util.HashMap;

public class ChessBoard {

    private HashMap<Position, Piece> keyPositionvaluePiece;
    private HashMap<Piece, Position> keyPieceValuePosition;
    private Validator validator;
    public static final int MAX_BOARD_WIDTH = 7;
    public static final int MAX_BOARD_HEIGHT = 7;

    public ChessBoard() {
        this.keyPieceValuePosition = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
        this.keyPositionvaluePiece = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
        this.validator = new Validator();
    }

    public void addPiece(Piece piece, int xCoordinate, int yCoordinate) {
        if (validator.isValidPieceRow(xCoordinate, piece.getColor())) {
            piece.setPieceOnChessBoard(this, xCoordinate, yCoordinate);
        }
    }

    public void updatePiece(Piece piece, int xCoordinate, int yCoordinate) {
        Position newPosition = getNewPosition(xCoordinate, yCoordinate);
        this.keyPieceValuePosition.put(piece, newPosition);
        this.keyPositionvaluePiece.put(newPosition, piece);
    }

    public boolean isLegalPosition(int xCoordinate, int yCoordinate) {
        return validator.isValidCoordinates(xCoordinate, yCoordinate) && validator.isFreePosition(xCoordinate, yCoordinate);
    }

    public Position getPosition(Piece piece) {
        return this.keyPieceValuePosition.get(piece);
    }

    public Piece getPiece(Position position) {
        return this.keyPositionvaluePiece.get(position);
    }

    private Position getNewPosition(int xCoordinate, int yCoordinate) {
        if (this.isLegalPosition(xCoordinate, yCoordinate)) {
            return new Position(xCoordinate, yCoordinate);
        } else {
            return new Position(-1, -1);
        }
    }

    private class Validator {

        public boolean isValidPieceRow(int xCoordinate, Color color) {
            if (color == Color.WHITE) {
                return xCoordinate == 0 || xCoordinate == 1;
            }
            return xCoordinate == MAX_BOARD_HEIGHT - 1 || xCoordinate == MAX_BOARD_HEIGHT;
        }

        public boolean isValidCoordinates(int xCoordinate, int yCoordinate) {
            return this.isOnTheTable(xCoordinate, MAX_BOARD_WIDTH) && this.isOnTheTable(yCoordinate, MAX_BOARD_HEIGHT);
        }

        public boolean isOnTheTable(int coordinate, int tableLimit) {
            return 0 <= coordinate && coordinate < tableLimit;
        }

        public boolean isFreePosition(int xCoordinate, int yCoordinate) {
            return getPiece(new Position(xCoordinate, yCoordinate)) == null;
        }

    }
}
