package Model;

/**
 * Some classes inherit this class in order to contain a few base attributes like id and description.
 *
 * @author gilfmc & RitaNogueira + 1110119/1110285 (artur-kk / kameluh)
 */
public class BaseType {
   private int id;
   private String description;

   public BaseType(int id) {
      setId(id);
   }

   public BaseType(int id, String description) {
      setId(id);
      setDescription(description);
   }
   
   public BaseType(BaseType baseType) {
      setId(baseType.id);
      setDescription(baseType.description);
   }

   /**
    * Gets the id of this object
    *
    * @return the id
    */
   public int getId() {
      return id;
   }

   /**
    * Sets the id of this object
    *
    * @param id the new id
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * Gets the description of this object
    *
    * @return the description
    */
   public String getDescription() {
      return description;
   }

   /**
    * Sets the description of this object
    *
    * @param description the new description
    */
   public void setDescription(String description) {
      if (description == null)
         throw new IllegalArgumentException();
      this.description = description;
   }

    @Override
    public String toString() {
        return "id=" + id + ", description=" + description + ";\n";
    }
   
   
}
