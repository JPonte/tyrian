package tyrian

/** An application is a component with an initialization operation
  */
trait TyrianApp extends Component:
  /** Initialization operation
    * @return
    *   A model and a command to execute
    */
  def init: (Model, Cmd[Msg])
