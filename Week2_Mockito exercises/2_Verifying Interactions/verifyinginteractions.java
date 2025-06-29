public class verifyinginteractions {
    public static void main(String[] args) {
        MockExternalApi mockApi = new MockExternalApi(); 
        MyService service = new MyService(mockApi);
        service.fetchData();
        if (mockApi.wasGetDataCalled()) {
            System.out.println("getData() was called.");
        } else {
            System.out.println("getData() was NOT called.");
        }
    }
}

interface ExternalApi {
    String getData();
}
class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}

class MockExternalApi implements ExternalApi {
    private boolean called = false;

    @Override
    public String getData() {
        called = true;
        return "Mocked Response";
    }

    public boolean wasGetDataCalled() {
        return called;
    }
}