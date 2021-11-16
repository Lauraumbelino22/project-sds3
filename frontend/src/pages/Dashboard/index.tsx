import Footer from "components/Footer";
import NavBar from "components/NavBar";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";


const Dashboard = () => {
    return (
        <>
                        <NavBar />
                        <div className="container">
                                <h1 className="text-primary py-3">Dashboard De Vendas</h1>

                                <div className="row px-3">
                                   <div className="col-sm-6">
                                        <h5>Todas as Vendas</h5>
                                        <BarChart />
                                   </div>
                                   <div className="col-sm-6">
                                        <h5>Todas as Vendas</h5>
                                        <DonutChart />
                                   </div>
                                   </div>

                                   <div className="py-3"></div>
                                    <h2 className ="text-primary">Todas as Vendas</h2>
                               
                                




                  <DataTable />

                        </div>
                        <Footer />
                </>
        
    );
}

export default Dashboard;