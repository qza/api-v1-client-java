package info.blockchain.api.wallet;

/**
 * Used in response to the `send` and `sendMany` methods in the `Wallet` class.
 */
public class PaymentResponse {
    private String message;
    private String txHash;
    private String notice;
    private boolean success;

    public PaymentResponse (String message, String txHash, String notice) {
        this.message = message;
        this.txHash = txHash;
        this.notice = notice;
    }
    
    public PaymentResponse (boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof PaymentResponse) {
            PaymentResponse that = (PaymentResponse) o;
            return (this.getMessage().equals(that.getMessage()) && this.getTxHash().equals(that.getTxHash()) && this.getNotice().equals(that.getNotice()));
        }
        return false;
    }

    /**
     * @return Response message from the server
     */
    public String getMessage () {
        return message;
    }

    /**
     * @return Transaction hash
     */
    public String getTxHash () {
        return txHash;
    }

    /**
     * @return Additional response message from the server
     */
    public String getNotice () {
        return notice;
    }

    /**
     * @return payment status from the server
     */
    public boolean getSuccess () {
        return success;
    }
}
