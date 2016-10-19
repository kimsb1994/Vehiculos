import java.util.*;
import java.util.stream.Collectors;

    public class RegistroVehiculos {
        private Set<Coche> coches = new HashSet<>();

        public void registrarVehiculo(Coche coche){
            coches.add(coche);
        }

        // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
        // Lo puedes omitir si trabajas con Java 7
        public Coche obtenerVehiculo(String matricula){
            // java 8

            /*
            *  return coches.
            *  stream().
            *  filter(coche -> coche.getMatricula().equals(matricula)).
            *  findFirst();
            *  */

            // java 7
            Coche Matriculaobtenida = null;
            for(Coche obtener : coches){
                if(obtener.getMatricula().equals(matricula)){
                    Matriculaobtenida=obtener;
                }
            }
            return Matriculaobtenida;
        }

        public void eliminarVehiculo(String matricula){
            // Java 8
            // coches.removeIf(coche.getMatricula().equals(matricula));
        }

        public void obtenerVehiculoPrecioMax(){

            //Java 8
            // return coches.
            // stream();
            // max(Comparator.comparing(Coche::getPrecio));

            //Java 7
            int max=0;
            List<Coche> todos = new ArrayList<Coche>();
            for(Coche obtener : coches){
                if(obtener.getPrecio()>max) {
                    todos.add(obtener);
                }
            }
        }

        public List<Coche> obtenerVehiculosMarca(String marca){
            // Java 8
            // return coches.
            //stream();
            //filter(coche -> coche.getMarca().equals(marca)).
            //collect(Collectors.toList());

            //Java 7
            List<Coche> resultado = new ArrayList<Coche>();
            for(Coche obtener : coches){
                if(obtener.getMarca().equals(marca)){
                    resultado.add(obtener);
                }
            }
            return resultado;


        }

        public List<Coche> obtenerTodos(){



            //Java 7
            List<Coche> resultado = new ArrayList<Coche>();
            for(Coche obtener : coches){
                resultado.add(obtener);
            }
            return resultado;

        }
    }
