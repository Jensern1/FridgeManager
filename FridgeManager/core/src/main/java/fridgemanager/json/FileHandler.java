package fridgemanager.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import fridgemanager.core.FridgeManager;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * Wrapper class for JSON serialization and deserialization.
 * Avoid direct compile dependencies on Jackson for other modules.
*/
public class FileHandler implements InterfaceFileHandler {

  private String fileName;
  private ObjectMapper objectMapper;

  /**
   * Method for initializing the the object.
  */
  public FileHandler() {
    fileName = "FridgeSave.txt";
    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new FridgeManagerModule());
  }

  /**
   * Method for saving a FridgeManager object to the specified location.
  */
  public void saveObject(FridgeManager fridgeManager) {
    try (Writer writer = new FileWriter(fileName, StandardCharsets.UTF_8)) {
      objectMapper.writerWithDefaultPrettyPrinter().writeValue(writer, fridgeManager);
    } catch (IOException e) {
      System.out.println("Saving to file faild");
      e.printStackTrace();
    }
  }

  /**
   * Loads the saved FridgeManager object from system to app Returns the saved object if it exists,
   * null otherwise.
  */
  public FridgeManager loadFridgeManager() {
    try (Reader reader = new FileReader(fileName, StandardCharsets.UTF_8)) {
      return objectMapper.readValue(reader, FridgeManager.class);
    } catch (IOException e) {
      System.out.println("The file did not load, missing file?");
      e.printStackTrace();
    }
    return null;
  }
}