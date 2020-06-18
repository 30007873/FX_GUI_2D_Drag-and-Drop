package ToDo;

import java.io.Serializable;

public class Status implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String status;

    public Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}