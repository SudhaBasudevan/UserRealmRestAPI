@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT u FROM User u where u.userName = ?1 and u.userDescription = ?2 ")
    Optional<User> register(String username,String userDescription);
   
}
