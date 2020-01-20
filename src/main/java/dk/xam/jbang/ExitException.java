package dk.xam.jbang;

/**
 * Used when wanting to exit app from a command.
 */
public class ExitException extends RuntimeException {

	private final int status;

	public ExitException(int status) {
		this.status = status;
	}

	public ExitException(int status, Throwable cause) {
		super(cause);
		this.status = status;
	}

	public ExitException(int status, String message, Throwable cause) {
		super(message, cause);
		this.status = status;
	}

	public ExitException(int status, String s) {
		this(status, s, null);
	}

	public int getStatus() {
		return status;
	}
}
