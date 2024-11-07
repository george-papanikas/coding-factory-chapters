package gr.aueb.cf.ch16.functionalinterfaces;

@FunctionalInterface
public interface IDChecker {

    /**
     * Checks for specific students ids
     *
     * @param student
     *         the {@link Student} instance
     * @return
     *         true, if the id of the student is valid based on the predicate,
     *         otherwise, false
     */
    boolean checkId(Student student); // predicate
}
