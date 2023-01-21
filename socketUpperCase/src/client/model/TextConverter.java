package client.model;

import java.util.List;

public interface TextConverter {
    String toUpperCase(String text);

    List<String> getLogs();
}
