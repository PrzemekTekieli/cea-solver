package sample.model

class NumericNetwork(
    private val nodes: Map<Int, NumericIndividual>,
    private val edges: List<Edge>,
    private val neighbourhoods: Map<Int, Neighbourhood<NumericIndividual>>
) : Network<NumericIndividual> {

    override fun getNode(nodeId: Int): NumericIndividual? {
        return nodes[nodeId]
    }

    override fun getNeighbourhood(nodeId: Int): Neighbourhood<NumericIndividual>? {
        return neighbourhoods[nodeId]
    }


}