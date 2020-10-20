
#include <iostream>
#include <set>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{

    int jackSize, jillSize;

    while(cin >> jackSize >> jillSize && jackSize != 0 && jillSize != 0){ //execute this code at least once


        //Create Sets
        std::vector<int> jack, jill,intersect;

        int use;

        
        //Fill Jack's CDs
        for (int i = 0; i < jackSize; i++)
        {
            cin >> use;
            jack.push_back(use);
        }
        //Fill Jill's CDs
        for (int i = 0; i < jillSize; i++)
        {
            cin >> use;
            jill.push_back(use);
        }

        //Find intersection of the same CD
        set_intersection(jack.begin(), jack.end(), jill.begin(), jill.end(), std::back_inserter(intersect));
        cout << intersect.size() << endl;

    }

}