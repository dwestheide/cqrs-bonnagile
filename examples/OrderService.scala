trait OrderService {
  def finishOrder(order: Order): Unit
  def cancelOrder(order: Order): Unit
  def getOrder(id: OrderId): Option[Order]
  def getCancelledOrders(): Seq[Order]
  def getFinishedOrders(): Seq[Order]
}