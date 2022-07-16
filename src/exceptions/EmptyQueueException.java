package exceptions;

public class EmptyQueueException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyQueueException()
	{
		super();
	}

	/**
	 * @param message error message specific to cause of error.
	 */
	public EmptyQueueException(String message)
	{
		super(message);
	}
}
